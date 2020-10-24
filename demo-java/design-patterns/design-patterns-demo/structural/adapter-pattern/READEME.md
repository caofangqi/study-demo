#  适配器(包装器)模式  Adapter(Wrapper) Pattern

# 意图 Intent 
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
将一个类的接口转换成客户希望的另一个接口。适配器模式让那些接口不兼容的类可以一起工作

比如 电源适配器，三控插头插不进 双控插头 这个时候需要电源适配器

# 适用性 Applicability
  * you want to use an existing class, and its interface does not match the one you need
* you want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* you need to use several existing subclasses, but it's impractical to adapt their interface by subclassing every one. An object adapter can adapt the interface of its parent class.
* most of the applications using third party libraries use adapters as a middle layer between the application and the 3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application code.
