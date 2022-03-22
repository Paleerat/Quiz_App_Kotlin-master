package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "1.ใครคือผู้พัฒนา Kotlin?",

           "Google",
           "IntelliJ IDEA",
           "คราส",
           "JetBrains",
           4
       )
       var question2 = QuestionData(
           2,
           "2.Android Studio เวอร์ชันใดที่นำ kotlin init มาใช้?",

           "2.4",
           "3.4",
           "3",
           "2.1",
           3
       )
       var question3 = QuestionData(
           3,
           "3.Kotlin รุ่นปัจจุบันคืออะไร?",

           "1.1",
           "1.4",
           "1.3",
           "1.5.0",
           4
       )
       var question4 = QuestionData(
           4,
           "4.นามสกุลไฟล์ใดที่ใช้บันทึกไฟล์ Kotlin ?",

           ".java",
           ".kot",
           ".kt หรือ .kts",
           ".andriod",
           3
       )

       var question5 = QuestionData(
           5,
           "5.แสดงความคิดเห็นใน Kotlin ใช้รูปแบบอย่างไร?",

           "// comment",
           "*/ comment",
           "# comment",
           "<!-- comment -->",
           1
       )
       var question6 = QuestionData(
           6,
           "6.เป้าหมายใดต่อไปนี้ที่ Kotlin ไม่รองรับในปัจจุบัน?",

           "LLVM",
           ".NET CLR",
           "Javascript",
           "JetBrains",
           2
       )
       var question7 = QuestionData(
           7,
           "7.จะแสดงความคิดเห็นแบบหลายบรรทัดใน Kotlin ได้อย่างไร?",

           "//",
           "/* */",
           "/ multi line comment /",
           "*//*",
           3
       )
       var question8 = QuestionData(
           8,
           "8.Kotlin ใช้งานได้กับ Java เท่านั้นหรือไม่?",

           "ใช่",
           "อาจจะใช่",
           "ไม่",
           "ไม่แน่ใจ",
           3
       )
       var question9 = QuestionData(
           9,
           "9.ข้อใดไม่ใช่ประเภทข้อมูลพื้นฐานใน Kotlin ?",

           "Numbers",
           "Strings",
           "Arrays",
           "Lists",
           4
       )
       var question10 = QuestionData(
           10,
           "10.Kotlin มีคีย์เวิร์ดคงที่หรือไม่?",

           "ใช่",
           "อาจจะใช่",
           "ไม่",
           "ไม่แน่ใจ",
           3
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       return que
   }
}