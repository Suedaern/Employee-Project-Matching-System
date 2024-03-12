package com.example.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto
{
    private String userName;
    private String userSurname;

    public UserDto(Builder builder)
    {
        this.userName=builder.userName;
        this.userSurname=builder.userSurname;
    }

    @NoArgsConstructor
    public static class Builder
    {
        private String userName;
        private String userSurname;

        public Builder userName(final String userName)
        {
            this.userName=userName;
            return this;
        }
        public Builder userSurname(final String userSurname)
        {
            this.userSurname=userSurname;
            return this;
        }

        public UserDto build()
        {
            return new UserDto(this);
        }
    }
}
