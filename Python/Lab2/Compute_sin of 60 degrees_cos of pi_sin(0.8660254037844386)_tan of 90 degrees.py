import math

a = math.sin(math.radians(60))
b = math.cos(math.pi)
c = math.sin(0.8660254037844386)
d = "undefined" if math.cos(math.pi/2) == 0 else math.tan(math.pi/2)

print("Sin of 60 degrees:", a)
print("Cos of pi:", b)
print("Sin(0.8660254037844386):", c)
print("Tan of 90 degrees:", d)
