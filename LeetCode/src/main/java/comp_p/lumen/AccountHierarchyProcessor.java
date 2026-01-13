package comp_p.lumen;


// Java Coding Exercise (20 minutes)
// Problem Statement:
// Account Hierarchy Data Processor
// You're working on Lumen's account data aggregation service. You need to implement a service that processes hierarchical account data and ensures data integrity.
// Given the following requirements:
// Accounts have a parent-child relationship (tree structure)
// Each account has an ID, name, and optional parent ID
// You need to validate that the hierarchy is consistent (no cycles, valid parent references)
// Return a list of root accounts (accounts with no parent)
// Starter Code:
import java.util.*;
public class AccountHierarchyProcessor {
    public static class Account {
        private String id;
        private String name;
        private String parentId;
        public Account(String id, String name, String parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }
        // Getters
        public String getId() { return id; }
        public String getName() { return name; }
        public String getParentId() { return parentId; }
        @Override
        public String toString() {
            return String.format("Account{id='%s', name='%s', parentId='%s'}",
                    id, name, parentId);
        }
    }
    public static class ValidationException extends Exception {
        public ValidationException(String message) {
            super(message);
        }
    }
    /**
     * Validates account hierarchy and returns root accounts
     * @param accounts List of all accounts
     * @return List of root accounts (accounts with no parent)
     * @throws ValidationException if hierarchy is invalid
     */
    public List<Account> processAccountHierarchy(List<Account> accounts) throws ValidationException {
        if (accounts == null) return Collections.emptyList();

        // 1) Index accounts by id + validate duplicates / blank ids
        Map<String, Account> byId = new HashMap<>();
        for (Account a : accounts) {
            if (a == null) continue;

            String id = trim(a.getId());
            if (isBlank(id)) throw new ValidationException("Blank account id: " + a);

            if (byId.putIfAbsent(id, a) != null) {
                throw new ValidationException("Duplicate account id: " + id);
            }
        }

        // 2) Validate parent references exist + prevent self-parent
        for (Account a : accounts) {
            if (a == null) continue;

            String id = trim(a.getId());
            String pid = trim(a.getParentId());

            if (!isBlank(pid)) {
                if (!byId.containsKey(pid)) {
                    throw new ValidationException("Missing parentId '" + pid + "' for account '" + id + "'");
                }
                if (id.equals(pid)) {
                    throw new ValidationException("Cycle: account '" + id + "' is its own parent");
                }
            }
        }

        // 3) Cycle detection (walk parent chain for each node)
        for (String startId : byId.keySet()) {
            Set<String> seen = new HashSet<>();
            String cur = startId;

            while (true) {
                if (!seen.add(cur)) {
                    throw new ValidationException("Cycle detected involving account id: " + cur);
                }
                String pid = trim(byId.get(cur).getParentId());
                if (isBlank(pid)) break;      // reached a root
                cur = pid;
            }
        }

        // 4) Return roots
        List<Account> roots = new ArrayList<>();
        for (Account a : accounts) {
            if (a == null) continue;
            if (isBlank(trim(a.getParentId()))) roots.add(a);
        }
        return roots;
    }

    private static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    private static String trim(String s) {
        return s == null ? null : s.trim();
    }

    // Test method
    public static void main(String[] args) {
        AccountHierarchyProcessor processor = new AccountHierarchyProcessor();
        // Test case 1: Valid hierarchy
        List<Account> accounts2 = Arrays.asList(
                new Account("1", "Root Corp", null),
                new Account("2", "Division A", "1"),
                new Account("3", "Division B", "1"),
                new Account("4", "Team X", "2"),
                new Account("5", "Another Root", null)
        );

        List<Account> accounts = Arrays.asList(
                new Account("1", "Root Corp", null),
                new Account("2", "Division A", "1"),
                new Account("3", "Division B", "1"),
                new Account("4", "Team X", "2"),
                new Account("5", "Another Root", null)
        );
        try {
            List<Account> roots = processor.processAccountHierarchy(accounts);
            System.out.println("Root accounts: " + roots);
        } catch (ValidationException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}

