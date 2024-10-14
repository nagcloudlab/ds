const box = {
  items: ["a", "b", "c"],
  [Symbol.iterator]() {
    let index = 0;
    return {
      next: () => {
        if (index < this.items.length) {
          return { value: this.items[index++], done: false };
        } else {
          return { done: true };
        }
      },
    };
  },
};

for (const item of box) {
  console.log(item);
}
