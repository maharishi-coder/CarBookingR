package Model;

public abstract class Person {
        private String name;
        private String age;
        private String gender;

        public Person(String name, String age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

}
