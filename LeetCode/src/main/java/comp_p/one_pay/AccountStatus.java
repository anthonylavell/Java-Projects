package comp_p.one_pay;

import lombok.Getter;

public enum AccountStatus {
    UNFREEZE("ACTIVE"),
    FREEZE("FROZEN");

    @Getter
    final String status;
    AccountStatus(String status){
        this.status = status;
    }

}
