public class Main {
    public static void main(String[] args) {
        FamilyTree myFamilyTree = new FamilyTree();
        System.out.println("En person: " + myFamilyTree.getCurrentName());
        System.out.println("Personens mor: " + myFamilyTree.lookUpParentName("mother"));
        myFamilyTree.moveToAncestor("mother");
        System.out.println("En person: " + myFamilyTree.getCurrentName());
        System.out.println("Personens mor: " + myFamilyTree.lookUpParentName("mother"));
    }
}
















//        myFamilyTree.moveToAncestor("mother");
//                System.out.println("En person: "+myFamilyTree.getCurrentName());
//                System.out.println("Personens mor: "+myFamilyTree.lookUpParentName("mother"));
//                myFamilyTree.moveToAncestor("mother");
//                System.out.println("Personens mor: "+myFamilyTree.lookUpParentName("mother"));