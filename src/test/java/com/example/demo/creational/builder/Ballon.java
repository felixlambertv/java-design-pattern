package com.example.demo.creational.builder;

public class Ballon {
    public String color;
    public String shape;

    public Ballon(Builder builder){
        this.color = builder.color;
        this.shape = builder.shape;
    }

    public static class Builder {
        private String color;
        private String shape;

        public static Builder newInstance(){
            return new Builder();
        }
        private Builder(){}

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setShape(String shape){
            this.shape = shape;
            return this;
        }

        public Ballon build(){
            return new Ballon(this);
        }
    }
}
