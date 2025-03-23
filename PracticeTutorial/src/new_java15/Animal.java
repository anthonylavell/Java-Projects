package new_java15;
//Animal will only permit Dog and Cat to extend it's class
sealed class Animal permits Dog,Cat {
}
non-sealed class Dog extends Animal{}

