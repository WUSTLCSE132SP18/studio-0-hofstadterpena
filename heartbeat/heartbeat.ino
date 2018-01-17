void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);
}

void loop() {

  digitalWrite(13, HIGH);
  delay(50);
  digitalWrite(13, LOW);
  int x = millis();
  Serial.print(x/1000);
  Serial.print(" sec have elapsed. millis = ");
  Serial.println(x);
    delay(1000);

}
