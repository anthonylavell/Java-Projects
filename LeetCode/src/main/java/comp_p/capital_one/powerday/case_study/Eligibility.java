package comp_p.capital_one.powerday.case_study;

public class Eligibility {
    public static final int ElIGIBLE = 1;
    public static final int NOT_ElIGIBLE = 0;

    public static int runEligibility(boolean isActive, boolean wasAcquired, boolean hasRestrictions){
        if (!isActive) {
            if (wasAcquired){
                if (hasRestrictions) {
                    return NOT_ElIGIBLE;
                }else if (!wasAcquired){
                    return ElIGIBLE;
                }
                else {
                    return NOT_ElIGIBLE;
                }
            }else {
                return NOT_ElIGIBLE;
            }
        } else if (!hasRestrictions) {
            if (!wasAcquired){
                return ElIGIBLE;
            } else if (!isActive){
                return NOT_ElIGIBLE;
            } else {
                return ElIGIBLE;
            }
        } else if (!wasAcquired) {
            return NOT_ElIGIBLE;
        }
        return NOT_ElIGIBLE;
    }

    public static int runEligibility2(boolean isActive, boolean wasAcquired, boolean hasRestrictions){
        if (!isActive) {
            return NOT_ElIGIBLE;
        } else if (!hasRestrictions) {
            return ElIGIBLE;
        } else if (!wasAcquired) {
            return NOT_ElIGIBLE;
        }
        return NOT_ElIGIBLE;
    }

    public static int runEligibility(boolean isActive, boolean hasRestrictions){
        if (isActive && hasRestrictions) {
            return ElIGIBLE;
        }
        return NOT_ElIGIBLE;
    }
}
