package com.example.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkTimeArchiveDto
{
    private int reportId;
    private Date date;
    private int workAmount;

    public static class Builder
    {
        private int reportId;
        private Date date;
        private int workAmount;

        public Builder setValues(int reportId, Date date, int workAmunt)
        {
            this.reportId=reportId;
            this.date=date;
            this.workAmount=workAmount;
            return this;
        }

        public WorkTimeArchiveDto build()
        {
            return new WorkTimeArchiveDto(reportId,date,workAmount);
        }
    }
}
