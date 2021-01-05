import sys

data = []

def show_data(n):

	for k in range(n):
		a = len(data)
		b = sys.getSizeOf(data)
		print("Length: {0:3d}; Size in bytes: {1:4d}".format(a, b))
		data.append(None)
