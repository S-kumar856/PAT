class parent_one:
    def message (self):
        print("in class one")
class parent_two(parent_one):
    def message(self):
        super().message()
        print("in class two")

ob = parent_two()
# ob1 = parent_one()
ob.message()
# ob1.message()