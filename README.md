# Simple-MVP-Architecture
Android Clean Architecture with MVP Pattern

<b>Model:</b><br> 
it is an interface responsible for managing data. Model’s responsibilities include using APIs, caching data, managing databases and so on. 
The model can also be an interface that communicates with other modules in charge of these responsibilities. 
For example, if you are using the Repository pattern the model could be a Repository. 
If you are using the Clean architecture, instead, the Model could be an Interactor.<br>
<br>
<b>Presenter:</b> <br>
the presenter is the middle-man between model and view. All your presentation logic belongs to it. 
The presenter is responsible for querying the model and updating the view, reacting to user interactions updating the model.<br>
<br>
<b>View:</b><br> 
it is only responsible for presenting data in a way decided by the presenter. 
The view can be implemented by Activities, Fragments, any Android widget or anything that can do operations like showing a ProgressBar, updating a TextView, populating a RecyclerView and so on.<br>



<br><br>



