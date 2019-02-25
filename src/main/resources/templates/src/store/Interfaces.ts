export interface Post {
  body: string,
  id: number,
  title: string,
  userId: number,
}

export namespace Post {
  export const NULL: Post = { id: 0, userId: 0, title: '', body: '' }
}
