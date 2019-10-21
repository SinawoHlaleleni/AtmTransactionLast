package com.example.AtmTransaction.domain.account;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Objects;

public class Fixed {
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

    private Fixed(){}

    private Fixed(Builder builder){

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

        public Fixed build() {
            return new Fixed(this);
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
        Fixed fixed = (Fixed) obj;
        return fixed.equals( fixed.id);        }

    @Override
    public int hashCode() {
        return Objects.hash(amount);        }
}



