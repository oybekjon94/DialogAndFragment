# DialogAndFragment
A dialog is a small window that prompts the user to make a decision or enter additional information. A dialog does not fill the screen and is normally used for modal events that require users to take an action before they can proceed.
![image](https://github.com/oybekjon94/DialogAndFragment/assets/91370134/93e175b2-e7df-45af-bae4-fc55a8ecd403)

The Dialog class is the base class for dialogs, but you should avoid instantiating Dialog directly. Instead, use one of the following subclasses:
### AlertDialog
A dialog that can show a title, up to three buttons, a list of selectable items, or a custom layout.
### DatePickerDialog or TimePickerDialog
A dialog with a pre-defined UI that allows the user to select a date or time.

# Fragments
A Fragment represents a reusable portion of your app's UI. A fragment defines and manages its own layout, has its own lifecycle, and can handle its own input events. Fragments can't live on their own. They must be hosted by an activity or another fragment. The fragment’s view hierarchy becomes part of, or attaches to, the host’s view hierarchy.

![image](https://github.com/oybekjon94/DialogAndFragment/assets/91370134/6c1d1112-2fd7-4ecd-a07b-3cf20416cf04)
