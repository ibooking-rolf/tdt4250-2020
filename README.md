# TDT4250

By: Rolf Aas

This is the official repository for my assignements in the course TDT4250 - Advanced Software Design at NTNU, Fall 2020. In this README you'll find the folder structure of this repository, an image of the current model, my rationale beheind the chosen model.

The repo has had a major overhaul for assignment 2 as I quickly discovered that the model I created in assignment 1 would not be easy to work with in Accelero. Therefore the old repo is outdated.

### Changes made
The main changes done are addition and removal of certain ownerships between the classes, as well as a "parent" class. To make the M2T transformation easier, each specialization has x number of semester, and each semester have their own `mandatoryCourseGroup` and `electiveCourseGroup`.

The `University` class was made to have at most 1 root node, such that all other classes have ultimately the same ancestor. This way the transformation is easy and efficient.

As my understanding of how Eclipse works (workspaces, projects, perspectives, views etc.) I realised I had misunderstood the project structure in the first assignment. Hence the folder and project structure was changed dramatically from assignemnt 1. The old structure, model and rational will still be at the bottom of this readme, but they will be outdated.


### Folder structure
* `tdt4250` - model project
  * `tdt4250/model` - Ecore model and genmodel files
  * `tdt4250/model/University.xmi` - one working instance of the model
  * `tdt4250/src-gen` - automatically generated code, as well as hand written code
  * `tdt4250/src-gen/tdt4250` - interfaces
  * `tdt4250/src-gen/tdt4250.impl` - the actual implemented classes/enums
* `tdt4250.edit`
* `tdt4250.editor`
* `tdt4250.m2t` - Acceleo project. Tranformation from model to text


### Pre-requisits
You need to have the latest versions of Java (8.0.261) and Eclipse (2020-06)

The following plug-ins must be installed:
From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category checked

* **Acceleo** - model to text transformation (M2T) and OCL interpreter view
* **Ecore Diagram Editor (SDK)** - editor for ecore models as diagram
* **EMF Forms SDK** - forms for ecore models
* **Sirius Specifier Environment** - diagram-based DSL framework
* **Sirius Properties Views** - Specifier Support
* **Mylyn WikiText** - editor for various wiki markup formats, including markdown

From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category un-checked:

* **Acceleo Query SDK** - OCL implementation

From the software site http://hallvard.github.io/plantuml (type into text field):

PlantUML Ecore Feature and PlantUML Feature (under PlantUML Eclipse support)
PlantUML Library Feature (under PlantUML Library)

In addition, install the graphviz command line application and register its path to dot executable in the PlantUML preferences in Eclipse.
The Eclipse PlantUML plugin is incompatible with the latest graphviz version, so use v2.38.


### How to run
1. Clone the repo ([Link](https://github.com/reaas/tdt4250-2020.git))
2. Run `tdt4250.m2t/src/tdt4250/m2t/main/generate.mtl` as a Accelero Application with the following settings:
   * **Project**: tdt4250.m2t
   * **Main class**: tdt4250.m2t.main.Generate
   * **Model**: `/tdt4250/model/University.xmi`
   * **Target**: `/tdt4250.m2t/src/tdt4250/m2t/main`
3. You will now find the result in `/tdt4250.m2t/src/tdt4250/m2t/main/NTNU.html`


### Model - Assignment 2

![Model](https://raw.githubusercontent.com/reaas/tdt4250-2020/master/assignment2-image.png)


### Folder structure - Assingment 1

* `model/` contains the Ecore model and genmodel files
* `src-gen/` contains automatically generated code, as well as hand written code
  * `src-gen/assignement1.sp` contains the interfaces of each class/enums
  * `src-gen/assignment1.sp.impl` contants the actualt implemented classes/enums
  * `src-gen/assignment1.sp.util`

### Model - Assingment 1

![Model](https://raw.githubusercontent.com/reaas/TDT4250/master/model.png)


### Rationale - Assignment 1
* A study programme consists of n-number of semesters, and can contain several specializations
* A specialization is only selectable in a sepcific semester of a programme
* A semester contains courses whos credits should add up to 30 for each semester
* The available courses are either mandatory or elective, depending on the specifications of the programme/spesialization


### TODO
* Setup constraints on `courseLevel`. Should check that a semester has number of required number of courses on the given level
* Write tests for all entities
