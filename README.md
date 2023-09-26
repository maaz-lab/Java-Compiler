# Java-Compiler
Compiler that translate code into Assembly Language,
Building a compiler who compile java from assembly language

## Phases of Compiler
  <img width="377" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/f61abe71-6f43-4623-883e-87252de578dc">

### LEXICAL ANAYLIZER
Lexical analysis is the **first phase** of a compiler. It takes the modified source code from language preprocessors that are written in the form of sentences.Lexical analysis breaks these syntaxes into a series of tokens, by removing any white spaces or comments in the source code.

   1. Firstly scanner remove all the whitespace and ignore the Comments and characters into one. with the help of **regular languages** and **expressions**, a convenient notation for specifying lexeme patterns which is stored in **Symbols table**.

<img width="542" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/4f92ef38-71e4-4f36-b036-b9a2524e1c32">
   
   2. making token using source code.
   3. then give to "syntax analyzer"
   

### SYNTAX ANALYZER
  <img width="627" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/95d71171-4e29-423a-ac4e-d5f6d13d3a2d">

  1. It is used to specify the syntax of a language.
  2. Its also called **parser**, which mainly focus to build parse tree upon the tokens which is given by **lexical anlyzer**.
  -> **For example,** an if-else statement in Java can have the form

     <img width="269" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/9662aae4-3193-4cea-8908-23aedf31696f">

  <img width="463" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/2e7cce70-18a4-4d24-bfb8-b827bfa8709e">

  <img width="577" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/9c23e4be-ea58-494b-913b-7378fe53ef47">
  
  **Ambiguity**
  
  <img width="662" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/cf5751b5-2bc0-439f-b546-4823013f953b">



### SYMENTIC ANYALAZER
  1. 
### INTERMEDIATE CODE DEPENDENCY
### MACHINE INDENPENDENT CODE OPTIMIZER
### CODE GENERATOR
### MACHINE DEPENDENT CODE OPTIMIZER

### Symbol Tables
Symbol tables are data structures that are used by compilers to hold information about source-program constructs.
The information that symbol table contains identifier such as its character string (or lexeme) , its type, its position in storage, and any other relevant information. Variable names, defined constants, procedure and function names, literal constants and strings, source text labels, compiler-generated temporaries.

![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/29fd22e1-ed0e-47f7-8d18-4b98454f3009)


![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/ca2200a2-815c-4714-8df1-31112b6dd221)

