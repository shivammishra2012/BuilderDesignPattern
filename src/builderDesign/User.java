package builderDesign;

public class User {

    private final String Name;
    private final String phoneNO;//optional
    private final int id;
    private final int age;// optional

    public User(Builder builder) {
        this.Name = builder.name;
        this.phoneNO = builder.phoneNO;
        this.age = builder.age;
        this.id = builder.id;
    }

    public static class Builder {
        private final String name;
        private String phoneNO;
        private final int id;
        private int age;

        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Builder setPhoneNo(String phoneNO) {
            this.phoneNO = phoneNO;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public User build()
        {
            return new User(this);
        }


    }

}
