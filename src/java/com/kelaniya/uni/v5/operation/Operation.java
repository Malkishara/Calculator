package com.kelaniya.uni.v5.operation;


//Abstract class or Interface class -> Interface
public interface Operation {

    Double execute(Double[] numbers) throws InvalidCalcOperationException;
}


//Animal, Dog, Cat...Animal ->  abstract class
// -> sharable properties (food preference, age,.. etc)
//-> sharable methods/behaviours
//if you see any common properties in subclasses, then use a abstract class.

//Interface classes -> share only the method signature

//concrete class
