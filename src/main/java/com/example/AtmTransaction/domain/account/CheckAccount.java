package com.example.AtmTransaction.domain.account;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "check_account")
public class CheckAccount {
    @Id
    @Column(name = "checkid")
    private String id;
    @Column(name = "amount")
    private double amount;

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    private CheckAccount(){}

    private CheckAccount(Builder builder){

        this.id= builder.id;
        this.amount=builder.amount;
    }

    public static class Builder {
        private String id;
        private double amount;

        public Builder Id(String Id) {
            this.id = Id;
            return this;
        }
        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public CheckAccount build() {
            return new CheckAccount(this);
        }
    }
    @Override
    public String toString() {
        return "Builder{" +
                "Id='" + id + '\'' +
                ", Amount='" + amount + '\'' +
                '}';
    }
        @Override
        public boolean equals(Object obj) {
            if(this ==obj)return true;
            if(obj == null|| getClass() !=obj.getClass()) return false;
            CheckAccount checkAccount = (CheckAccount) obj;
            return checkAccount.equals( checkAccount.id);        }

        @Override
        public int hashCode() {
            return Objects.hash(amount);        }
    }

