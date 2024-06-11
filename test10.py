import tkinter as tk

def on_button_click():
    label.config(text="Hello, " + entry.get() + "!")

# Create the main window
root = tk.Tk()
root.title("Simple GUI")

# Create a label
label = tk.Label(root, text="Enter your name:")
label.pack()

# Create a text entry widget
entry = tk.Entry(root)
entry.pack()

# Create a button
button = tk.Button(root, text="Submit", command=on_button_click)
button.pack()

# Run the application
root.mainloop()
