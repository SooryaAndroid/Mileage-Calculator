# Mileage-Calculator
### Mileage Calculator Using Java Android

#### Sample Java Code

```java
    public void calcuation(String curt, String prevoius, String quantity, String price){

        Float current_reading = Float.parseFloat(curt);
        Float previous_reading = Float.parseFloat(prevoius);
        Float fuel_quantity = Float.parseFloat(quantity);
        Float fuel_price = Float.parseFloat(price);
        Float mileage = (current_reading - previous_reading)/fuel_quantity;
        Float coast_km = (fuel_price)/(mileage);
        txt_fuel_mileage.setText(mileage.toString());
        txt_total_fuelprice.setText(coast_km.toString());


    }
```
#### Sample XML Code

```xml
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.android.mileagecalculator.MainActivity">


    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="current meter reading"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        tools:layout_constraintTop_creator="1"
        tools:layout_constraintRight_creator="1"
        android:layout_marginTop="3dp"
        tools:layout_constraintLeft_creator="1"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/edt_current_reading"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView"
        tools:layout_constraintLeft_creator="1"
        tools:layout_constraintRight_creator="1" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="8dp"
        android:text="Previous meter reading "
        app:layout_constraintBottom_toTopOf="@+id/edt_previous_reading"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_current_reading"
        tools:layout_constraintRight_creator="1"
        tools:layout_constraintLeft_creator="1" />

    <EditText
        android:id="@+id/edt_previous_reading"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="55dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintHorizontal_bias="0.502"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_current_reading"
        tools:layout_constraintLeft_creator="1"
        tools:layout_constraintRight_creator="1"
        tools:layout_constraintTop_creator="1" />

    <EditText
        android:id="@+id/edt_fuel_quantity"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="8dp"
        android:layout_marginStart="16dp"
        android:layout_marginTop="79dp"
        android:ems="10"
        android:inputType="numberDecimal"
        app:layout_constraintHorizontal_bias="0.509"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/edt_fuel_price"
        app:layout_constraintTop_toBottomOf="@+id/edt_previous_reading" />

    <EditText
        android:id="@+id/edt_fuel_price"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginTop="79dp"
        android:ems="10"
        android:inputType="numberDecimal"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_previous_reading" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="23dp"
        android:layout_marginLeft="11dp"
        android:layout_marginRight="8dp"
        android:layout_marginStart="11dp"
        android:layout_marginTop="8dp"
        android:text="fuel quantity"
        app:layout_constraintBottom_toTopOf="@+id/edt_fuel_quantity"
        app:layout_constraintHorizontal_bias="0.402"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/textView4"
        app:layout_constraintTop_toBottomOf="@+id/edt_previous_reading"
        app:layout_constraintVertical_bias="1.0"
        tools:layout_constraintBottom_creator="1"
        tools:layout_constraintLeft_creator="1"
        android:layout_marginEnd="8dp" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="23dp"
        android:layout_marginRight="8dp"
        android:layout_marginTop="8dp"
        android:text="fuel price"
        app:layout_constraintBottom_toTopOf="@+id/edt_fuel_price"
        app:layout_constraintHorizontal_bias="0.429"
        app:layout_constraintLeft_toLeftOf="@+id/edt_fuel_price"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_previous_reading"
        app:layout_constraintVertical_bias="1.0"
        tools:layout_constraintBottom_creator="1"
        tools:layout_constraintLeft_creator="1"
        tools:layout_constraintRight_creator="1"
        android:layout_marginEnd="8dp" />

    <Button
        android:id="@+id/btn_calculate"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="45dp"
        android:text="caculate"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/edt_fuel_price" />

    <TextView
        android:id="@+id/txt_fuel_mileage"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        android:layout_marginRight="35dp"
        app:layout_constraintRight_toRightOf="parent"
        android:layout_marginTop="25dp"
        app:layout_constraintTop_toBottomOf="@+id/btn_calculate"
        android:layout_marginEnd="35dp" />

    <TextView
        android:id="@+id/txt_total_fuelprice"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        android:layout_marginRight="35dp"
        app:layout_constraintRight_toRightOf="parent"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toBottomOf="@+id/txt_fuel_mileage"
        android:layout_marginEnd="35dp" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="43dp"
        android:layout_marginRight="8dp"
        android:layout_marginTop="25dp"
        android:text="fuel mileage"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/txt_fuel_mileage"
        app:layout_constraintTop_toBottomOf="@+id/btn_calculate"
        android:layout_marginStart="43dp"
        android:layout_marginEnd="8dp" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginLeft="34dp"
        android:layout_marginRight="8dp"
        android:layout_marginTop="37dp"
        android:text="total fuel price"
        app:layout_constraintHorizontal_bias="0.015"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@+id/txt_total_fuelprice"
        app:layout_constraintTop_toBottomOf="@+id/textView7"
        android:layout_marginStart="34dp"
        android:layout_marginEnd="8dp" />
</android.support.constraint.ConstraintLayout>
```
