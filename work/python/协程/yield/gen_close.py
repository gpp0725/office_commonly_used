def gend_func():
    yield "http://projectsedu.com"  # 我们希望返回的值可以传入别的函数进行操作
    yield 2
    yield 3
    return "bobby"


if __name__ == '__main__':
    gen = gend_func()
    print(next(gen))
    gen.close()
    next(gen)
# generatorExit是继承自BaseException,Exception

