class Support:
    def __init__(self, name):
        self.name = name

    def setNext(self, next):
        self.next = next

    def support(self, trouble):
        if self.resolve(trouble):
            self.done(trouble)
        elif self.next != None:
            self.next.support(trouble)
        else:
            self.fail(trouble)

    def resolve(self, trouble):
        pass

    def done(self, trouble):
        print(f'{trouble.name} is resolved by {self.name}.')

    def fail(self, trouble):
        print(f'{trouble.name} cannot be resolved.')
