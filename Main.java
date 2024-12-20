public class Main {
    public static void main(String[] args) {
        class Animal  {
            private String name;
            private String type;

            public Animal (String name, String type) {
                this.name = name;
                this.type = type;
            }

            public String getAnimal() {
                return "Animal: " + name + " ,type " + type ;
            }
        }

        class Zookeeper {
            private String name;
            private int experience;

            public Zookeeper(String name, int experience) {
                this.name = name;
                this.experience = experience;
            }

            public String getZookeeper() {
                return "Zookeeper: " + name + ", experience: " + experience;
            }
        }

        class Zoo {
            private String name;
            private String city;

            public Zoo(String name, String city) {
                this.name = name;
                this.city =city;
            }

            public String getZoo() {
                return "Zoo: " + name  + ",city:"+ city;
            }
        }

        Animal animal = new Animal ("Tiger", "predator");
        Zookeeper zookeeper = new Zookeeper ("Ersin Azamat",8);
        Zoo zoo = new Zoo(" Алматинский зоопарк","Almaty");

        System.out.println(animal.getAnimal());
        System.out.println(zookeeper.getZookeeper());
        System.out.println(zoo.getZoo());
    }
}
