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
    public List<Account> processAccountHierarchy(List<Account> accounts)
            throws ValidationException {
        // TODO: Implement validation and return root accounts
        // 1. Validate no cycles exist
        // 2. Validate all parent references are valid
        // 3. Return root accounts (parentId is null or empty)
        Map<String, Set<String>> graph = new HashMap<>();
        Map<String,Account>vaildParent = new HashMap<>();
        List<Account> parentAccount = new ArrayList<>();

        for (Account account : accounts){
            String child = account.getId();
            String parent = account.getParentId() == null ? "" :account.getParentId();
            graph.putIfAbsent(child,new HashSet<>());
            if (!parent.isEmpty()) {
                graph.putIfAbsent(parent, new HashSet<>());
                if (graph.get(parent) != null) {
                    graph.get(child).addAll(graph.get(parent));
                }
                if (graph.get(child).contains(child)) {
                    throw new ValidationException("Cycle");
                }
                graph.get(child).add(parent);
            }
            vaildParent.putIfAbsent(child, account);
        }

        for(String parent : graph.keySet()){
            if(vaildParent.get(parent) == null){
                throw new ValidationException("No Parent");
            }else if(graph.get(parent).isEmpty()){
                parentAccount.add(vaildParent.get(parent));
            }
        }
        return parentAccount;
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

