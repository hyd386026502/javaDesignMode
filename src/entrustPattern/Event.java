package entrustPattern;

import java.lang.reflect.Method;

public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramsTypes;

    public Event(Object object, String  methodName, Object[] params){
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    private  void contractParamTypes(Object[] params){
        this.paramsTypes = new Class[params.length];
        for (int i=0;i<params.length;i++){
            this.paramsTypes[i]=params[i].getClass();
        }
    }
    public void  invoke() throws Exception{
        Method method = object.getClass().getMethod(this.methodName,this.paramsTypes);
        method.invoke(this.object,this.params); //利用反射机制调用函数
    }
}
