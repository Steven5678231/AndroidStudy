# ChatperTwo: Activity  


1. Classification:
    
    Implicit intent
    
    Explicit intent

2. Communication between activities
        
    a) Intent.putExtra(name, value)  
    b) pass down  
    c) pass back: setResult(RESULT_OK, intent) Upper activity should override onActivityResult

3. Life Cycle of Activity: Use task to manage activity  
    
    a) A task is a set of activity in the stack  
        Back stack: finish() pop out the top activity  
        STATUS:  
            1. RUNNING: top of the stack  
            2. PAUSE: NOT on the top of stack, but is viewable  
            3. STOP: neither on top nor viewable, record according status and variables but will be recycled once others need more RAM  
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
            ![Lifecycle](https://raw.githubusercontent.com/Steven5678231/AndroidStudy/master/LifeCycle.PNG)
            When run other activity, onPause and onStop would be called, so if the upper activity is recycled, onCreate()will be called
            ---onSaveInstanceState()
    b) Launch Mode
        Manifest.xml => android:launchMode=""
        1. Standard: create an instance every time start an activity  
        2. SingleTop: one instance if and only if it's already at the top of stack
        3. singleTask: check in the stack and pop out all of the existed activity above the task.  For example, top-bottom: D-C-B-A, D intent start A=> onRestart A, onDestroy BCD, leaving only A in the stack.  
        4. singleInstance: most complex, create a new back stack to manage the activity(getTaskId()can show they are in different stack), this can help share activity
4. Important method Summary
```
Toast.makeText(Activity.this, text, Toast.LENGTH_SHORT).show()

onCreateOptionsMenu() {getMenuInflater().infalte('menupath')}

Intent:
    Intent intent = new Intent(Activity.this, anotherActivity.class);
    startActivity(intent)

Passing data:
    intent.putExtra(key, value);
    getIntent();
    intent.getStringExtra(key);

    // A
    startActivityForResult(intent, 1)
    // use this to start next activity can get the data passed from them
    @Override
    onActivityResult(int requestCode, int resultCode, Intent data)
    // B
    setResult(RESULT_OK/.., intent);
    finish()

    start activity passing data:
    // B
    Intent intent = new Intent(context, BActivity.class); // context = AActivity
    intent.putExtra()
    context.startActivity(intent);
    // A
    BActivity.actionStart(AActivity.this, extraData);
```

# ChapterThree:
## UI elements
1. TextView  
    android:gravity="center"/top/bottom..  
    android:textSize  
    android:textColor  
2. Button  
    android:textAllCaps="false" disable auto transfer to Cap  
3. EditText  
    android:hint=""

    editText.getText().toString() // get the context of the input of EditText
4. ImageView  
    android:src=""

    imageView.setImageResource("picture") // set image
5. ProgressBar  
    style= //set loading style  
    android:visibility="visible"/invisible/gone  
    getVisibiliity()  
    setVisibility(View.VISIBLE/View.INVISIBLE/View.GONE)  
    getProgress()
    setProgress()
6. AlertDialog + ProgressDialog

## Layout

     



