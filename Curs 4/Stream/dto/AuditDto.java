package Stream.dto;

import Stream.entity.Audit.Action;

import java.time.LocalDate;

public class AuditDto {
    public String username;
    public LocalDate date;
    public Action action;

    public final LocalDate getDate() {
        return date;
    }

    public final Action getAction() {
        return action;
    }

    public final String getUsername() {
        return username;
    }

}
