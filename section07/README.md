## Inheritance

---
OOP - is a way to model real world objects, as software objects, which contain both data and code.

Sometimes called *Class Based Programming*

Class - template or blueprint for creating an object
- describes data (fields) and behavior (methods)
- a class member can be a field, or method, or some other type of dependent element
- if a field is static, there is only one copy in memory, and this values is associated with the class, or template, itself
- if a field is not static, it's called an instance field
    - thus, each object may have a different value stored for this field
- static method can't be dependent on any one object's state, so it can't reference any instance members
- in other words, any method that operates on instance fields, needs to be non-static
- could be called variables, but methods are better name
- class could be thought of as a powerful user-defined data type
  - (not an official definition)

---
Classes can be organized into logical groupings, which are called packages
___
A class is said to be a top-level class, if it is defined in the source code file, and not enclosed in the code block of another class, type, or method

---
Class is a blueprint

---

#TODO (insert photo of access modifier notes here)

---

Encapsulation - example is making classes private
  - 2 meanings for encapsulation
  - bundling of behavior and attributes on a single object
  - practice of hiding fields and some methods 

---
Null - variable or attribute has a type, but no reference to an object
  - primitive data types cannot be null
  - Strings are not primitive so they can be null

---
Getter - retrieves value of a private field and returns it
Setter = sets the value of a private field
Purpose of both - to control, protect, and access private fields
One of many goals - set validation when storing with setters
___
This - special reference for name for the object or instance, which it can use to descrive itself
- and thus, we can use *this* to access fields on the class

---