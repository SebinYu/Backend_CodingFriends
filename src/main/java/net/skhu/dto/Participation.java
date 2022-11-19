package net.skhu.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Participation {
    BigInteger participationRate_id;

    Integer studentId;
    Integer studygroupId;
    String studyGroup_Leader;
    Integer week;
    String weeklyAttendance;
    String weeklyHomework;
    private LocalDateTime updateDate;
}