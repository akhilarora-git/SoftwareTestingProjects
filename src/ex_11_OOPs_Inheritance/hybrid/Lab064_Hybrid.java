package ex_11_OOPs_Inheritance.hybrid;

public class Lab064_Hybrid {

    //class Son extends Mother, Father{}
// Not possible by using classes due to Diamond problem
}
class GF{}

class Father extends GF{}
class Mother extends GF{}
class Son extends Father{}

//class Son extends Mother, Father{}
// Not possible by using classes due to Diamond problem
