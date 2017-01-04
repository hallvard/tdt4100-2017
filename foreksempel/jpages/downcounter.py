counter = 3;

def isFinished() :
    return counter == 0

def countDown() :
    if not isFinished() :
        global counter
        counter = counter - 1;
