module zoo.animal.care {
    exports zoo.animal.care.details;
    //whenever a modules requires zoo.animal.care, it should not specify zoo.animal.feeding. because it is part of the zoo.animal.care.
    requires transitive zoo.animal.feeding;
}
