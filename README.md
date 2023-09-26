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
The semantic analyzer uses the syntax tree and the information in the symbol table to check the source program for semantic consistency with the language definition. It also gathers type information and saves it in either the syntax tree or the symbol table, for subsequent use during intermediate-code generation

<img width="649" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/604c0a23-0408-4ecb-bf00-7c4b71d40da8">

<img width="248" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/f9b1fc3d-3010-4595-acbf-402fe5059a7b">

Suppose that position, initial, and rate have been declared to be floating-point numbers, and that the lexeme 60 by itself forms an integer. The type checker in the semantic analyzer in Fig. 1.7 
discovers that the operator * is applied to a floating-point number rate and an integer 60. In this case, the integer may be converted into a floating-point 
number. In Fig. 1.7, notice that the output of the semantic analyzer has an extra node for the operator inttofloat, which explicitly converts its integer argument into a floating-point number


### INTERMEDIATE CODE DEPENDENCY
### MACHINE INDENPENDENT CODE OPTIMIZER
### CODE GENERATOR
### MACHINE DEPENDENT CODE OPTIMIZER

### Symbol Tables
Symbol tables are data structures that are used by compilers to hold information about source-program constructs.
The information that symbol table contains identifier such as its character string (or lexeme) , its type, its position in storage, and any other relevant information. Variable names, defined constants, procedure and function names, literal constants and strings, source text labels, compiler-generated temporaries.

![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/29fd22e1-ed0e-47f7-8d18-4b98454f3009)


![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/ca2200a2-815c-4714-8df1-31112b6dd221)


<img width="532" alt="image" src="https://github.com/maaz-lab/Java-Compiler/assets/134712721/a8a3f933-c7ed-4225-81d4-fe14f73b4cfb">

so lets go to the interesting part of symbol table, and that is how we organize our symbol tables,means what data structure algorithym we apply to manage data in symbol table.

there are many data structures algorithym but write now i am focus on **three** data structure algorithym.
1. **Linear List**


   ![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/7af6768b-aed4-4e22-acea-c1a4a8290d9b)

   Use a single large table to hold records. When a collision is encountered, use a simple technique (i.e., add a constant) to compute subsequent indices into the table until an empty slot is found or the table is full. If the constant is relatively prime to the table size, this, eventually, will check every slot in the table.

2. **Binary Tree**


   ![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/f6f28522-1196-4366-827b-6f532af3569d)

An unbalanced tree would have similar behaviour as a linear list (this could arise if symbols are entered in sorted order).
A balanced tree (path length is roughly equal to all its leaves) would take O(log2n) probes per lookup (worst-case). Techniques exist for dynamically rebalancing trees.

3. **HashTable**


   ![image](https://github.com/maaz-lab/Java-Compiler/assets/134712721/38856840-eec4-490c-95a9-d706fb38a777)

Uses a hash function, h, to map names into integers; this is taken as a table index to store information. Potentially O(1), but needs inexpensive function, with good mapping properties, and a policy to handle cases when several names map to the same single index.
