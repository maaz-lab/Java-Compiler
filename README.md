# Java-Compiler
Compiler that translate code into Assembly Language,
Building a compiler who compile java from assembly language

## Phases of Compiler
<img width="233" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/be8c9a2a-30c9-46e6-964d-87bd75b84c9c">

### LEXICAL ANAYLIZER
Lexical analysis is the first phase of a compiler. It takes the modified source code from language preprocessors that are written in the form of sentences.Lexical analysis breaks these syntaxes into a series of tokens, by removing any white spaces or comments in the source code.

   |__ Firstly scanner remove all the whitespace and ignore the Comments and characters into one. with the help of **regular languages** and **expressions**, a convenient notation for specifying lexeme patterns which is stored in **Symbols table**.
     
  <img width="377" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/f61abe71-6f43-4623-883e-87252de578dc">


   |__ making token using source code
   |__ then give to "syntax analyzer"
   
   <img width="542" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/4f92ef38-71e4-4f36-b036-b9a2524e1c32">

### SYNTAX ANALYZER
   |__ 
### SYMENTIC ANYALAZER
### INTERMEDIATE CODE DEPENDENCY
### MACHINE INDENPENDENT CODE OPTIMIZER
### CODE GENERATOR
### MACHINE DEPENDENT CODE OPTIMIZER
