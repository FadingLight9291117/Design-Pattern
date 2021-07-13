from support import Support


class LimitSupport(Support):
    def __init__(self, name, limit):
        super().__init__(name)
        self.limit = limit

    def resolve(self, trouble):
        if trouble.number <= self.limit:
            return True
        else:
            return False


class OddSupport(Support):
    def __init__(self, name):
        super().__init__(name)

    def resolve(self, trouble):
        if trouble.number % 2 == 1:
            return True
        else:
            return False



