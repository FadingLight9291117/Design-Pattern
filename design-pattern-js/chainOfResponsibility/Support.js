class Support {
    name
    next
    constructor(name) {
        this.name = name;
    }

    setNext(next) {
        this.next = next;
        return next;
    }

    support(trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (this.next) {
            next(trouble);
        } else {
            fail(trouble);
        }
    }

    resolve(trouble) { }

    done(trouble) {
        console.log(`${trouble.name} is resolved by ${this.name}`)
    }

    fail(trouble) {
        console.log(`${trouble.name} cannot be resolved.`)
    }
}