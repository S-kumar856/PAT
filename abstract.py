from abc import ABC,abstractmethod

class Example(ABC):
    @abstractmethod
  

    def method_one(self):
        print("hi")
class Student(Example):
    def method_one(self):
        print("helo")


ob = Example()
ob.method_one()

