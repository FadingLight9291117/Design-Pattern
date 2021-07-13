from trouble import Trouble
from supports import LimitSupport, OddSupport

if __name__ == '__main__':
    alice = LimitSupport('alice', 10)
    bob = OddSupport('bob')

    alice.setNext(bob)

    trouble = Trouble(number=28)

    alice.support(trouble)
