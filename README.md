# 2020.9.3 

## Activity:   


    Classification:
        Implicit intent
        Explicit intent

    Communication between activities
        Intent.putExtra(name, value)
        pass down
        pass back: setResult(RESULT_OK, intent) Upper activity should override onActivityResult

    Life Cycle of Activity: Use task to manage activity
    A task is a set of activity in the stack
        Back stack: finish() pop out the top activity
        STATUS:
            1. RUNNING: top of the stack
            2. PAUSE: NOT on the top of stack, but is viewable
            3. STOP: neither on top nor viewable, record according status and variables but will be recycled once others need more RAM,
            4. ELIMINATE: activity removed from stack
        CALLBACK function:
            1. onCreate
            2. onStart
            3. onResume
            4. onPause
            5. onStop
            6. onDestroy
            7. onRestart
            1-6 : whole/complete cycle (onCreate init, on Destroy release RAM)
            2-5 : viewable (onStart:loading resource, onStop:release Resources)
            3-4 : Running
![Lifecycle](LifeCycle.png)



