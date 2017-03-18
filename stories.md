===

## Welcome to Runner Island

A group of runners are invited to the amazing Runner Island. There are 10 tasks waiting for them.
The tasks are divided into four stages, the runner needs to finish the first stage to unlock the second stage, 
the same for the third and final stage. The tasks are categorized as three types: 

1. tasks can be finished by running for a certain distance
2. tasks can be finished by running for a certain period of time
3. tasks can always be finished no matter how long or how fast your run 

Each runner has a unique token for identification.
They are geared up with a wearing equipment which has a terminal. 
The runner can send http requests to start challenging the task by `curl`(yes, don't worry, the runners are trained in advance to master it)
The equipment will send running activity data automatically.
 
You are the developer to implement the system for the Island, good luck. 

## Stories

### Runner start running

```
As a runner
I want to mark the task that I'm going to have a try
so that the equipment starts to record the distance and duration
```

### Runner stop running

```
As a runner
I want to end running
so that the equipment sends the activity data to check if the task can be completed 
```

### Runner unlock task stage

```
As a runner
I am able to unlock the next stage
so that I can challenge the new task  
```

### Runner list tasks

```
As a runner
I want to list the tasks
so that I can see my current status  
```