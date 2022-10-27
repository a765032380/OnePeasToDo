package pub.gll.libaptprocessor

import com.google.auto.service.AutoService
import pub.gll.libaptannotation.Print
import javax.annotation.processing.AbstractProcessor
import javax.annotation.processing.ProcessingEnvironment
import javax.annotation.processing.Processor
import javax.annotation.processing.RoundEnvironment
import javax.lang.model.SourceVersion
import javax.lang.model.element.TypeElement
import javax.tools.Diagnostic

@AutoService(Processor::class)
class MyProcessor : AbstractProcessor() {
    override fun init(processingEnv: ProcessingEnvironment) {
        super.init(processingEnv)
        println("----------")
        processingEnv.messager.printMessage(Diagnostic.Kind.NOTE,"----------------------")
    }

    override fun process(p0: MutableSet<out TypeElement>?, roundEnv: RoundEnvironment): Boolean {
        //拿到所有添加Print注解的成员变量
        val elements = roundEnv.getElementsAnnotatedWith(Print::class.java)
        elements.forEach {element->
            //拿到成员变量名
            val simpleName = element.simpleName
            //输出成员变量名
            processingEnv.messager.printMessage(Diagnostic.Kind.NOTE,simpleName)

        }
        return false
    }

    override fun getSupportedAnnotationTypes(): MutableSet<String> {
        val hashSet = hashSetOf<String>()
        hashSet.add(Print::class.java.canonicalName)
        return hashSet
    }

    override fun getSupportedSourceVersion(): SourceVersion? {
        return processingEnv.sourceVersion
    }




}