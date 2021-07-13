class AFoo:
    def __init__(self, name):
        self.name = name
    
    def print(self):
        print(f'this\'s name is {self.name}')

    def show(self):
        self.print()

class Foo(AFoo):
    def __init__(self, name):
        super().__init__(name)
    
    def print(self):
        print(f'my name is {self.name}')
    
if __name__ == '__main__':
    foo = Foo('ckz')
    foo.show()