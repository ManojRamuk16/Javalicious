package constructor;

class CopyConstructor {
    int id;
    String name;

    // Parameterized constructor
    CopyConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor s) {
        this(s.id+1,s.name+"hi");
    }

    // Display method
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
	CopyConstructor s2 = new CopyConstructor(s1); 
        CopyConstructor s1 = new CopyConstructor(101, "Manoj"); // Original object
                  // Copy constructor

        System.out.println("Original CopyConstructor:");
        s1.display();

        System.out.println("Copied CopyConstructor:");
        s2.display();
    }
}
