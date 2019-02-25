import {Post} from '../store/Interfaces'
import * as React from 'react'
import {PostItem} from './post-item'

interface Props {
  posts: ReadonlyArray<Post>
}

export class PostsWrapper extends React.Component<Props> {

  constructor (props: Readonly<Props>) {
    super(props)
  }

  render () {
    return (
            <div style={{
              fontFamily: 'Roboto, sans-serif',
              width: '420px',
              margin: 'auto'}}>
                {this.props && this.props.posts.map(post => <PostItem item={post} key={post.id} />)}
            </div>
    )
  }
}
