package com.project

class FileExamples {
    static void main(String[] args)
    {
//        new File("E:/TestDemo.txt").eachLine { 
//           line -> printf("line: $line")
//          
//           new File("E:/TestDemo.txt").withWriter("utf-8")
//           {
//               Writer -> Writer.writeLine("hellow Nithya menon.. ")
//           }
//        };
//        File file = new File("E:/TestDemo.txt")
//        println "The file ${file.absolutePath} has ${file.length()} bytes"
        
//        def file = new File('E:/TestDemo.txt')
//        file.delete()
        
//        File file=new File("E:/File1.txt")
//        File file1=new File("E:/File2.txt")
//        file1 << file.text
        
//        def rootFiles = new File("test").listRoots()
//        rootFiles.each {
//           file -> println file.absolutePath
//        }
        
//        new File("E:/SpringExamples").eachFile() {
//            file->println file.getAbsolutePath()
//         }
        new File("E:/Nagarj Details").eachFileRecurse() {
            file -> println file.getAbsolutePath()
         }
//    }
}
}