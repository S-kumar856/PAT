class School:
    def fun1(self):
        print("this is school")

class Student1(School):
    def fun2(self):
        print("this is student1 ")

class Student2(School):
    def fun3(self):
        print("this is a student2")
class Student3(School):
    def fun4(self):
        print("this is a student3")

class Student4(Student1,Student2):
    def fun5(self):
        print("this is a student4")

ob = Student4()
ob.fun1()
ob.fun2()
ob.fun3()