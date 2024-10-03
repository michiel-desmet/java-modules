module zoo.animal.talks {
    //Only zoo.staff can access the content of zoo.animal.talks.content
    exports zoo.animal.talks.content to zoo.staff;
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;

    requires transitive zoo.animal.care;
}
