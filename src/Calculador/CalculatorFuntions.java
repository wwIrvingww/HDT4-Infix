package Calculador;

public class CalculatorFuntions implements ICalculator{

    @Override
    public float Add(float number1, float number2) {
        return (number1+number2);
    }

    @Override
    public float Substraction(float number1, float number2) {
        return (number1-number2);
    }

    @Override
    public float Multiply(float number1, float number2) {
        return  (number1*number2);
    }

    @Override
    public float Divition(float number1, float number2) {
        try{
            float a = number1 / number2;
        } catch (Exception e)
        {
            number1 = -3.14f;
        }

        return  (number1/number2);
    }
}