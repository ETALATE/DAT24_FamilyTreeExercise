public class FamilyTree {
    private Person current;

    public FamilyTree() {
        buildTree();
    }

    public void buildTree() {
        Person pia = new Person("Pia");
        Person hans = new Person("Hans");
        Person peter = new Person("Peter");
        peter.setMother(pia);
        peter.setFather(hans);

        Person olga = new Person("Olga");
        Person mogens = new Person("Mogens");
        pia.setMother(olga);
        pia.setFather(mogens);

        Person åse = new Person("Åse");
        Person søren = new Person("Søren");
        hans.setFather(søren);
        hans.setMother(åse);

        current = peter;
    }

    public String getCurrentName() {
        return current.getName();
    }

    public String lookUpParentName(String parent) {
        if (parent.equals("mother") && (current.getMother() != null)) {
            return current.getMother().getName();
        } else if (parent.equals("father") && (current.getFather() != null)) {
            return current.getFather().getName();
        } else {
            return current.getName() + " har ikke den forældre.";
        }
    }

    public void moveToAncestor(String ancestor) {
        if (ancestor.equals("mother") && (current.getMother() != null)) {
            current = current.getMother();
        } else if ((ancestor.equals("father") && (current.getFather() != null))) {
            current = current.getFather();
        }  else {
            System.out.println("Du kan ikke gå videre til " + current.getName() + "s forældre, da de ikke er angivet i træet.");
        }
    }

}
